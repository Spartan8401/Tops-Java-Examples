<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn Form</title>
</head>
<body>
<form name="insert" method="post" action="ActionController">
<table>
  <tr>
     <td>First Name : </td>
     <td> <input type="text" name="fname"></td>
     </tr>
     
     <tr>
     <td>Last Name : </td>
     <td><input type="text" name="lname"></td>
     </tr>
     
     <tr>
     <td>Email : </td>
     <td> <input type="text" name="email"></td>
     </tr>
     
     <tr>
     <td>Mobile : </td>
     <td> <input type="text" name="mobile"></td>
     </tr>
     
     
     <tr>
     <td>Address : </td>
     <td><textarea rows="5" cols="21"></textarea></td>
     </tr>
     
     <tr>
     <td>Gender : </td>
     <td>
     <input type="radio" name="gender" value="male">Male 
     <input type="radio" name="gender" value="female">FeMale 
     </td>
     </tr>
     
     
     <tr>
     <td>Hobby : </td>
     <td>
       <input type="checkbox" name="Hobby" value="Cycling">Cycling<br>
       <input type="checkbox" name="Hobby" value="Cricket">Cricket<br>
       <input type="checkbox" name="Hobby" value="gym">Gym<br>
       <input type="checkbox" name="Hobby" value="reading">Reading<br>
       <input type="checkbox" name="Hobby" value="movie">Movie
       </td>
       </tr>
       
       <tr>
       <td>Education :</td>
       <td>
            <select name="education">
            <option>------Select Option-------</option>
            <option value="">10th</option>
             <option value="">12th</option>
              <option value="">B.E.</option>
               <option value="">M.E.</option>
                <option value="">Bcs</option>
                 <option value="">Mca</option>
                  <option value="">Mba</option>
                  </select>
                  </td>
                  </tr>
            
            <tr>
            <td>Password</td>
            <td><input type="password" name="password">
            </td>
            </tr>
            
             <tr>
            <td>Confirm Password</td>
            <td><input type="password" name="cpassword">
            </td>
            </tr>
            
            
            <tr>
            <td>Resume:</td>
            <td><input type="file" name="resume">
            </td>
            </tr>
        
        <tr>
        <td colspan="2" align="center"></td>
        <td><input type="submit" name="action" value="Submit">
        </td>
        </tr>
</table>
</form>
</body>
</html>