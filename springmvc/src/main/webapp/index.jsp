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
      <div style="width:50%" class="m-auto">
         <form method="post" action="handleForm">
            <div class="mb-3">
               <label class="form-label">User Name</label> 
               <input type="text" class="form-control" name="username">
            </div>
            <div class="mb-3">
               <label class="form-label">Email address</label> 
               <input type="email" class="form-control" name="usermail">
            </div>
            <div class="mb-3">
               <label class="form-label">Password</label> 
               <input type="password" class="form-control" name="userpassword">
            </div>
            <div class="mb-3">
               <label class="form-label">Choose Occupation</label> 
               <select class="form-select" name="useroccupation">
                  <option value="Student">Student</option>
                  <option value="Business">Business</option>
                  <option value="Service">Service</option>
               </select>
            </div>
            
            <div class="m-auto" style="width:90%;">
            <h1 class="display-6 text-center">Address</h1>
            <div class="mb-3">
               <label class="form-label">City</label> 
               <input type="text" class="form-control" name="address.city">
            </div>
            
            <div class="mb-3">
               <label class="form-label">Country</label> 
               <input type="text" class="form-control" name="address.country">
            </div>
            
            <div class="mb-3">
               <label class="form-label">State</label> 
               <input type="text" class="form-control" name="address.state">
            </div>
            
            <div class="mb-3">
               <label class="form-label">Postal Code</label> 
               <input type="text" class="form-control" name="address.postalCode">
            </div>
            </div>
            
            <div class="mb-3">
               <label class="form-label">Get News Letters</label>
               <br>
               <label class="form-label">Yes</label> 
               <input class="form-check-input" type="radio" name="newsletters" value="yes">
               <label class="form-label ms-3">No</label>
               <input class="form-check-input" type="radio" name="newsletters" value="no">
            </div>
            <div class="mb-3 form-check">
               <input type="checkbox" class="form-check-input" name="agreeterm">
               <label class="form-check-label">I Agree</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
         </form>
      </div>
   </body>
</html>