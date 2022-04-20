<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 예제</title>
</head>
<body>
<form name="fileForm" method="post" enctype="multipart/form-data" 
action="upload.do">
<table width="450" border="1" align="center" bordercolordark="#FF9900" cellspacing="0" cellpadding="5">
    <tr bgcolor="#ffcc00"> 
    <td colspan="2" height="21"> 
      <div align="center"><b><font size="5">파일 업로드 예제</font></b></div>
    </td>
  </tr>
  <tr bgcolor="#FFff99"> 
      <td> 작성자</td>
      <td> <b> 
      <input type="text" name="userid" size=30>    </b> </td>
  </tr>   
   
  <tr bgcolor="#FFff99"> 
      <td> 파일명</td>
      <td> <input type="file" name="file"  id="file" size=30>      </td>
  </tr>
  <tr bgcolor="#FFff99"> 
    <td height="42" colspan="2"> 
      <div align="center">
        <input type="submit" name="Submit" value="파일 올리기">
      </div>
    </td>
  </tr>
</table>
</form>
</body>
</html>