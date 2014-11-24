<h2>Tutorial for Implementing a Python-like Syntax using Xtext </h2>
<p>Here we have a tutorial, with code, for the whitespaceblock project which is <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">on github here</a>. </p>
<h3>Why Python-like Syntax </h3>
<p>In this tutorial we discuss how to use Xtext to implement a DSL which may have syntax constructs similar to that used by the Python language, in particular, how to implement a syntax that depends on whitespace.</p>
<p>When writing DSLs using Xtext we may tend to base the syntax of our DSL on the Java language. If we are writing our DSL from scratch this may possibly be the best thing to do, there are many advantages to the java syntax.  However this is Xtext and we can change the syntax however we want, you may decide that for your DSL, a more Python-like syntax is better. Reasons for this may be:</p>
<ul>
  <li>You may be basing your DSL on an existing DSL which already uses whitespace.</li>
  <li>You may prefer the cleaner look of not having curly brackets.</li>
  <li>The end users may not want to type in curly brackets.   </li>
</ul>
<table width="600">
  <tr>
    <td><p>In a java-like language we have blocks of code for things like a method declaration or a 'while' construct. We delineate these blocks using curly brackets as shown on the right: </p>
    <p>That is, when the indent increases then a block starts and when the indent goes back to the previous value the block ends. </p></td>
    <td><table border="1">
      <tr>
        <td><pre>public void Fibonacci(int n){
    int a=0;
    int b = 1;
    while (a &lt; n) {
      println(a);
      a=b;
      b = a+b;
    }
    println();
}</pre></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td>A first step in making this syntax more Python-like  would be to remove the curly brackets. We still know where the blocks begin and end because each block has its own level of indentation. </td>
    <td><table border="1">
        <tr>
          <td><pre>public void Fibonacci(int n)
    int a=0;
    int b = 1;
    while (a &lt; n)
      println(a);
      a=b;
      b = a+b;
    println();
</pre></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td><p>A next step would be to modify the rules that use these blocks to look more Python-like so,<br />
      instead of: public void Fibonacci(int n)<br />
      we have: def fibonacci(int n):</p>
      <p>and,<br />
      instead of: while (a &lt; n)<br />
we have: while a &lt; n:</p></td>
    <td><table border="1">
        <tr>
          <td><pre>def fibonacci(int n):
    int a=0;
    int b = 1;
    while a &lt; n:
      println(a);
      a=b;
      b = a+b;
    println();
  </pre></td>
        </tr>
    </table></td>
  </tr>
  <tr>
    <td>Finally we could go to a full Python syntax: </td>
    <td><table border="1">
      <tr>
        <td><pre>def fibonacci(n):
     a, b = 0, 1
     while a &lt; n:
         print(a, end=' ')
         a, b = b, a+b
     print()</pre></td>
      </tr>
    </table></td>
  </tr>
</table>
<h3>Implementing The Code</h3>
<p>The plan here is to start with a grammar file that parses a Java-like syntax and then demonstrate how to convert that to a Python-like syntax.</p>
<p>The aim is not to create a fully working Python implementation but just to show how people can create their own DSL which has Python-like constructs.  The main one being the use of whitespace to delineate blocks.</p>
<p>My first thought, for this tutorial, would be to start with Xbase and show how to convert this to a Python-like syntax.  Here I am only really concerned with the syntax, to have a fully working Xbase requires a lot of extra code. To explain all about that in this tutorial would take a lot of time and that is not really what this tutorial is about. All I want to do here is explain how to implement a Python-like syntax. So I am going to cheat and take out some of the implementation stuff, this tutorial won't generate code or even do full validation but it will generate a working editor and I think that will be enough to show how to produce Python-like syntax. </p>
<p>I have therefore taken  the XBase grammar (<a href="https://github.com/eclipse/xtext/blob/master/plugins/org.eclipse.xtext.xbase/src/org/eclipse/xtext/xbase/Xbase.xtext">which you can get from here</a>) and made the following changes:</p>
<ul>
  <li>Remove  imports from Xbase and JavaVMTypes.</li>
  <li>Replace jvm types such as types::JvmIdentifiableElement and just use ID. </li>
  <li>Other hacks to get the grammar to compile. </li>
</ul>
<p><a href="https://github.com/martinbaker/xtextadd/blob/master/pbase/com.euclideanspace.pbase/steps/step2/Tutorial.xtext">Here is a pointer</a> to the resulting grammar. </p>
<h3>Try the Code so far. </h3>
<p>So start by creating a new Xtext project (in Eclipse goto File-&gt;New-&gt;Xtext -&gt;Xtext project).</p>
<ul>
  <li>Go through the wizard and set the project up as usual.</li>
  <li>Copy the contents of the <a href="https://github.com/martinbaker/xtextadd/blob/master/pbase/com.euclideanspace.pbase/steps/step2/Tutorial.xtext">grammar discussed above from here </a>  to the xtext grammar file in the project.</li>
  <li>Run mwe2 to build the project.</li>
  <li>Run the project in new Eclipse window.   </li>
</ul>
<table>
  <tr>
    <td>I have not yet got this to work with all constructs (as you can see in screenshot, 'while' construct does not work) </td>
    <td><img src="pbase1.png" alt="image" width="291" height="222" /></td>
  </tr>
</table>
<p>When I get this working with Java syntax I will then start to modify for Python syntax. </p>
<h2>Modifying the Syntax</h2>
<p>In order to do move toward Python we first need to change the terminals as discussed on <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">page here</a>. </p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>grammar org.eclipse.xtext.common.Terminals</pre></td>
    <td><pre>grammar org.eclipse.xtext.common2.PythonTerminals</pre></td>
  </tr>
</table>
<p>We also need to use a <a href="https://github.com/martinbaker/xtextadd/blob/master/whitespaceblock/com.euclideanspace.whitespaceblock/src/com/euclideanspace/whitespaceblock/PythonesqueTokenSource.java">cutomised token source</a> also  discussed on <a href="https://github.com/martinbaker/xtextadd/tree/master/whitespaceblock">page here</a>. </p>
<p>I am hoping this will eventually be built into Xtext and I am hoping that using the PythonTerminals grammar will automatically install the customised TokenSource but, for now, we will have to add it in manually. </p>
<h3>Blocks</h3>
<p>The main thing we want to do is delineate blocks using whitespace. As discussed already, most of the work for this is done in the customised TokenSource. In the grammar we replace '{' and '}' by BEGIN and END. Of course the user does not have to type BEGIN and END, these are added automatically by our TokenSource class when the indent level changes. Each time we increase the indent TokenSource puts this on a stack (pile) to make sure that the indents are unwound correctly. </p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>XBlockExpression returns XExpression hidden(SL_COMMENT,WS): 
	{XBlockExpression}
	<span class="style1">'{'</span>
		(expressions+=XExpressionOrVarDeclaration ';'?)*
	<span class="style1">'}'</span>;</pre></td>
    <td><pre>XBlockExpression returns XExpression hidden(SL_COMMENT,WS): 
	{XBlockExpression}
	<span class="style1">BEGIN</span>
		(expressions+=XExpressionOrVarDeclaration ';'?)*
	<span class="style1">END</span>;</pre></td>
  </tr>
</table>
<h3>Terminating Statements</h3>
<p>Java-like languages use a semicolon ';' to mark the termination of a statement. In a more Python-like DSL we may want a new-line to mark the termination of a statement. One way to approach this is to split the terminal WS (whitespace) into two parts: SP for space and tab and NL for newline and carriage return. We can the replace ';' in the grammar by NL. This is shown in the following example: </p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>XBlockExpression returns XExpression hidden(SL_COMMENT,WS): 
	{XBlockExpression}
	'{'
		(expressions+=XExpressionOrVarDeclaration <span class="style1">';'</span>?)*
	'}';
	
	where:
	
	terminal WS : (' '|'\t'|'\r'|'\n')+;</pre></td>
    <td><pre>XBlockExpression returns XExpression hidden(SL_COMMENT,SP): 
	{XBlockExpression}
	BEGIN
		(expressions+=XExpressionOrVarDeclaration  <span class="style1">NL</span>?)*
	END;	
	
where:
	
	terminal SP : (' '|'\t')+;
	terminal NL : ('\r'|'\n')+;</pre>
</td>
  </tr>
</table>
<p>The problem with this approach is that we can no longer make NL hidden because it is now a significant part of the grammar. This means that the grammar must explicitly handle empty lines and situations like that.</p>
<p>A much neater way would be to  process this in our custom TokenSource class and use this to insert a PhantomToken containing ';'. This would mean that we could leave the grammar as it is in our Java-like syntax.</p>
<p>In order to handle this in our custom TokenSource class we need it to insert a phantom ';' before every new-line, except:</p>
<ul>
  <li>When the indent level increases (don't put ';' after '{').</li>
  <li>On a blank line.</li>
  <li>On a line containing only a comment    . </li>
  <li>When the last significant character was a ';' (that is, no need for two semicolons in a row).</li>
  <li>After a backslash  (see line continuation below). </li>
  <li>Inside parentheses, brackets and braces (see line continuation below).</li>
</ul>
<p>However, in order to implement this in TokenSource we need lookahead which is not currently possible in TokenSource.</p>
<h3>Line Continuation</h3>
<p>It is not good practice to have excessively long lines in our source code. In a Java-like DSL we can insert whitespce wherever we want, but in a Python-like DSL newlines are significant so we need specific mechanisms for inserting lines: </p>
<h4>Backslash continuation </h4>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>int a = 1 +2 + 3 +
    4 + 5;</pre></td>
    <td><pre>a = 1 +2 + 3 + \
    4 + 5</pre></td>
  </tr>
</table>
<h4>Continuation lines</h4>
<p>If we include a new line  inside parentheses, brackets and braces, then we do not need to expicitly use a backslash. So our custom TokenSource needs to count parentheses, brackets and braces (remember braces in Python don't indicate blocks) to know what is a continuation line. </p>
<p>A variation of this is 'hanging indentation' where all the lines in a paragraph are indented except the first line. In the context of Python, the term is used to describe a style where the opening parenthesis of a parenthesized statement is the last non-whitespace character of the line, with subsequent lines being indented until the closing parenthesis.</p>
<h3>Comments</h3>
<p>Python-like languages use hash '#' to indicate a comment, changing '//' to '#' in the grammar is trivial: </p>
<table border="1">
  <tr>
    <th bgcolor="#FFFF00">Java-like</th>
    <th bgcolor="#FFFF00">Python-like</th>
  </tr>
  <tr>
    <td><pre>// single line comment</pre></td>
    <td><pre># single line comment</pre></td>
  </tr>
</table>
<p>However there are some variations that we have to be careful of: </p>
<h4>Inline Comments</h4>
<p>If we allow 'inline comments' in out DSL, that is, comments on same line as the code: </p>
<table border="1">
  <tr>
    <td><pre>while a &lt; n:                 # Continue until we have n terms </pre></td>
  </tr>
</table>
<p>Inline comments have an implicit new-line (which is a significant part of the syntax) so we must make sure that they are treated in the same way as new lines in the grammar. </p>
<h4>Block Comments</h4>
<p>Block comments are multi-line comments (equivalent to /* comment*/ in Java). Each line of a block comment starts with a # and a single space, I cant see any reason why this should not be parsed as if it were multiple single-line comments.</p>
<h2>Future Enhancements</h2>
<p>Xtext provides a fair degree of decoupling between the syntax and the semantics. It would be really good if, in the future, a chunk of code such as Xbase could have the ability to plug in different syntax such as a Java-like syntax and a Python-like syntax where both would have exactly the same functionality.  </p>