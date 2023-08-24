<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
   <head>
      <link
         href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
         rel="stylesheet"
         integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
         crossorigin="anonymous">
      <script
         src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
         integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
         crossorigin="anonymous"></script>
   </head>
   <body>
      <div style="width:60%" class="m-auto">
      <form:errors path="user.*" cssStyle="color:red" element="div" cssClass="alert alert-danger text-center mt-2"/>
         <form method="post" action="handleForm">
         	<div class="mb-3">
               <label class="form-label">User Name</label> 
               <input type="text" class="form-control" name="username">
                <div id="emailHelp" class="form-text">If user name starts with vowel it will fail at first only.</div>
            </div>
            
            <button type="submit" class="btn btn-primary">Submit</button>
         </form>
      </div>
   </body>
</html>