<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Week2Homework2</title>
    <script>
        function p_limit(obj,id){
            var num = obj.value.length;
            var wid = id;
            if(num>=8){
                document.getElementById(wid).style.display="none";
            }
            else{
                document.getElementById(wid).style.display="block";
            }

        }

        function validateInput() {
            var input = document.getElementById("dateInput").value;

            var regex = /^\d{2}\/\d{2}\/\d{4}$/;

            if (regex.test(input)) {
                var parts = input.split("/");
                var day = parseInt(parts[0]);
                var month = parseInt(parts[1]) - 1;
                var year = parseInt(parts[2]);

                var date = new Date(year, month, day);
                if (date.getDate() === day && date.getMonth() === month && date.getFullYear() === year) {
                    alert("Right！");
                } else {
                    alert("Wrong！");
                }
            } else {
                alert("Wrong！");
            }

        }
    </script>

    <style>
        *{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }

        ul{
            display:flex;
            list-style:none
        }
        body{
            display: flex;
            flex-direction: column;
        }
        #container1{
            width:100%;
            background-color: #788dad;
            padding-left: 40%;


        }
        .r-input{
            margin-bottom:20px;
        }
        .r-gender{
            margin-bottom: 20px;
        }
        input{
            height:25px;

        }
    </style>
</head>
<div class="header">
    <%@include file="header.jsp"%>

</div>

       <div id="container1">
           <form id="register" action="register" method="post">
               <div class="r-input">
                   <label>username</label><br>
                   <input Type="text" name="username"><br>
               </div>
               <div class="r-input">
                   <label >Password</label><br>
                   <input Type="password" minlength="8"  name="password"  onkeyup="javascript:p_limit(this,'p-limit')"><br>
                   <span id="p-limit">Password must larger than 8 characters</span>
               </div>
               <div class="r-input">
                   <label >Email</label><br>
                   <input Type="text" name="email"><br>

               </div>
               <div class="r-gender">
                   <label>Gender</label><br>
                   <ul >

                       <li><input  type="radio" value="male" name="gender" checked="true" ><label>male</label></li>
                       <li><input  type="radio"  value="female" name="gender"/><label>female</label></li>
                   </ul>

               </div>
               <div class="r-input">
                   <input Type="submit" name="submit" value="register" onclick="validateInput()"><br>
               </div>
               <div class="r-input">
                   <label>Brithdate</label><br>
                   <input Type="text" name="brithdate" placeholder="dd/mm/yyyy" required>
               </div>

           </form>
       </div>

<div class="footer">
<%@include file="footer.jsp"%>>
</div>
</html>