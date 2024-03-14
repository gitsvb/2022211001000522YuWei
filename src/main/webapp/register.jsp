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
        var fid = document.getElementById('fid');
        var mid = document.getElementById('mid');

        fid.addEventListener("mouseclick",c_gender_f)
        mid.addEventListener("mouseclick",c_gender_m)
        function c_gender_f() {
                fid.checked = 'true';
                mid.checked = 'false';
        }
        function c_gender_m(){
                mid.checked = 'true';
                fid.checked = 'false';
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
                    alert("输入日期格式正确！");
                } else {
                    alert("输入日期格式不正确！");
                }
            } else {
                alert("输入日期格式不正确！");
            }
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

        uL{
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
</head>
<body>
   <div id="container1">
       <form id="register">
           <div class="r-input">
               <label  >Name</label><br>
               <input Type="text" ><br>
           </div>
           <div class="r-input">
               <label >Password</label><br>
               <input Type="password" minlength="8"  name="password"  onkeyup="javascript:p_limit(this,'p-limit')"><br>
               <span id="p-limit">Password must larger than 8 characters</span>
           </div>
           <div class="r-input">
               <label >Email</label><br>
               <input Type="text"><br>

           </div>
           <div class="r-gender">
               <label>Gender</label><br>
               <ul >

                   <li><input  type="radio" value="male"id="mid" checked="true" ><label>male</label></li>
                   <li><input  type="radio"  value="female" id="fid"/><label>female</label></li>
               </ul>

           </div>
           <div class="r-input">
               <input Type="submit" id="submit" value="register" onclick="validateInput()"><br>
           </div>
           <div class="r-input">
               <label>Brithday</label><br>
               <input Type="text" id="brithday" placeholder="dd/mm/yyyy" required>
           </div>

       </form>
   </div>

</body>
</html>