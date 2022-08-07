/*
------------------------------------------------------------------------------------------
# SPA ( Single page Application) : traditional websites reloads pages from server.In SPA.
instead of reloading, it replaces content from DOM. 
# NPM or NPX is teh feature in NodeJs (npx for one time execution).
# <noscript>You need to enable JS to run this app</noscript>    => Inform to enable JS
# Components => Reusable code.
# In Angular, entry point of application => root Component(root.component.html)
# In React, entry point of application => index.js(App.js)
------------------------------------------------------------------------------------------
# The for attribute of the <label> tag should be equal to the
 id attribute of the <input> element to bind them together.
# JS is a programming language that runs on browzer,Browzer has JAVASCRIPT ENGINE to convert to 
  machine code. FireFox:Spidermonkey,Chrome,Microsoft edge:V8,(V8 is faster)
  So created NodeJs, a runtime environment using V8 engine for running Js.
#<script> tag in placed in body tag because the browzer parses from top to bottom.if its
  placed in head session,rendering will be difficult.(bad user experience)



import Protypes from 'prop-types'; //used to define datatype in react to avaoid errors

1. destructure props as {task,desc,#no}

2.
<Filename>.propTypes={
    task:"No value",
    desc:"No desc"
}

3. For passing edfault prop type
<Filename>.defaultProps={
    task:PropTypes.string,
    desc:PropTypes.string,
    sno:PropTypes.number.isRequired
}
*/