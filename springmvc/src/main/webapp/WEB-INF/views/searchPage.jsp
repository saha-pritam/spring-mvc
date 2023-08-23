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
   		<h1 class="text-center display-3 mt-5">Search On Google</h1>
   		<div style="width:50%;height:20%;" class="m-auto mt-2">
   			<form method="post" action="searchGoogle">
   				<div class="mb-3">
               		<input type="text" class="form-control" name="searchtext" placeholder="Search Something...">
            	</div>
            	<div class="text-center">
            	 	<button type="submit" class="btn btn-primary">Submit</button>
            	</div>
   			</form>
   		</div>
   		
   		<h1 class="text-center display-3">Search On Youtube</h1>
   		<div style="width:50%;height:20%;" class="m-auto mt-2">
   			<form method="post" action="searchYoutube">
   				<div class="mb-3">
               		<input type="text" class="form-control" name="searchtext" placeholder="Search Something...">
            	</div>
            	<div class="text-center">
            	 	<button type="submit" class="btn btn-primary">Submit</button>
            	</div>
   			</form>
   		</div>
   		
   		<h1 class="text-center display-3">Search On Wikipedia</h1>
   		<div style="width:50%;height:20%;" class="m-auto mt-2">
   			<form method="post" action="searchWikipedia">
   				<div class="mb-3">
               		<input type="text" class="form-control" name="searchtext" placeholder="Search Something...">
            	</div>
            	<div class="text-center">
            	 	<button type="submit" class="btn btn-primary">Submit</button>
            	</div>
   			</form>
   		</div>
   </body>
</html>