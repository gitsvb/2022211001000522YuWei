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
        body{
            display: flex;
            justify-content: center;
            height: 100vh;
            background: linear-gradient(#141e30,#243b55);
        }

        ul{
            display:flex;
            list-style:none
        }
        #container1{
            height:500px;
            width:300px;
            background-color:gray;
            position:absolute;
            padding:70px;
            margin:200px;
            display:flex;

        }
        #register{
            position: relative;
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
        #submit{
            height:30px;
        }
    </style>
    </style>
</head>
<body>
   <div id="container1">
       <form id="register" action="/2022211001000522YuWei_war_exploded/register" method="post">
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

</body>
</html>