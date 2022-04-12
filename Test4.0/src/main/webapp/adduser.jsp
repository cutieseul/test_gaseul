<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 부트스트랩 css -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<script src="https://kit.fontawesome.com/0ffbbfb20c.js" crossorigin="anonymous"></script>
<meta charset="UTF-8">

<!-- 부트스트랩 js -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<script type="js/main.js"></script>

<title>회원가입</title>

<style>
.adduser{
padding : 100px 0 100px 0;
}
.BreadCrumb{
padding : 30px 0 0 40px;
text-decoration: none;
font-style : none;
font-size: 1.2rem;
}
.adduser_table{
margin : 10px 10px 10px 10px;
}
</style>

</head>

<body>
	<!-- Header start -->
	<header id="Top">
		<nav class="navbar navbar-light " style="background-color: #BBBBBB;">
			<div class="container-fluid">
				<a class="navbar-brand" href="mainpage.jsp"><img src="image/homepageIcon.png" style="padding:5px 0 5px 20px;"></a>
				<nav class="navbar navbar-light bg-#BBBBBB">
					<div class="container-fluid" >
						<form class="d-flex" action="searchallCategory.do">
							<input class="form-control form-outline-secondary me-3" type="text" name="content"
								placeholder="상품이름을 검색하세요." aria-label="Search" >
							<button class="btn btn-outline-secondary" type="submit" ><i class="fa-solid fa-magnifying-glass"></i></button>
						</form>
					</div>
				</nav>
				<a class="nav-link" href="login.do" style="color:white;">로그인 <i class="fa-solid fa-right-to-bracket"></i></a> 
				<a class="nav-link" href="adduser.do" style="color:white;">회원가입 <i class="fa-solid fa-user-plus"></i></a>
				<a class="nav-link" href="wishlist.do" style="color:white;">장바구니 <i class="fa-solid fa-bag-shopping"></i></a> 
				<a class="nav-link" href="mpInformation.do" style="color:white;">마이페이지 <i class="fa-solid fa-circle-user"></i></a>
				<a class="nav-link" href="orderpageCategory.do" style="color:white;">주문조회 <i class="fa-solid fa-circle-user"></i></a>
				<a class="nav-link" href="serviceCenter.do" style="color:white;">고객센터 <i class="fa-solid fa-house-user"></i></a>
				
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarScroll"
					aria-controls="navbarScroll" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
			</div>
			<div class="container-fluid" style="background-color: #EEEEEE;">
				<div class="collapse navbar-collapse" id="navbarScroll">
					<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
						style="-bs-scroll-height: 50px;">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="mainpage.do">Home</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#"
							id="navbarScrollingDropdown" role="button"
							data-bs-toggle="dropdown" aria-expanded="false"> 전체 카테고리 </a>
							<ul class="dropdown-menu"
								aria-labelledby="navbarScrollingDropdown">
								<li><a class="dropdown-item" href="allCategory.do"> 상품 전체보기</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="studentCategory.do"> 학생용 의자</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="officeCategory.do"> 사무용 의자</a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="interiorCategory.do"> 인테리어 의자 </a></li>
								<li><hr class="dropdown-divider"></li>
								<li><a class="dropdown-item" href="stoolCategory.do"> 스툴 / 좌식의자 </a></li>
							</ul>
						</li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.jsp"></a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<!-- Header End -->
	
	<!-- Bread Crumb Start -->
	<div class = "BreadCrumb">
		<section class="breadCrumb">
			<nav aria-label="breadcrumb">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="mainpage.jsp">Home</a></li>
			    <li class="breadcrumb-item active" aria-current="page">회원가입</li>
			  </ol>
			</nav>
		</section>
	</div>
	<!-- Bread Crumb End -->
	
	<!-- 여기부터 넣으시면 됩니다 Start -->
	<div class="adduser" align="center">
<script type="text/javascript">
   function checkMember() {
      
      
      var form = document.member
      
      var regExpuId = /^[A-Za-z0-9+]{5,12}$/
      var uId = form.uId.value
      if(!regExpuId.test(uId)){
         alert("아이디는 5~12자리 영문과 숫자로만 입력해주세요.")
         form.uId.select()
         return
      }
      
      /* var regExpuPw = /^[A-Za-z0-9+]{5,12}$/
      var uPw =form.uPw.value
      if(!regExpuPw.test(uPw)){
         
         alert("비밀번호는 5~12자리 영문과 숫자로만 입력해주세요.")
         form.uPw.select()
         return
      } */
      
          //비밀번호와 비밀번호 확인이 맞지 않다면..
         /*  if (uPw != uPw2) {
              alert("두 비밀번호가 맞지 않습니다.");
              form.uPw.focus();
              return false;
          }  */

          var regExpuPw = /^[A-Za-z0-9+]{5,12}$/
          var uPw =form.uPw.value
         var uPw2 =form.uPw2.value
         
         if(!regExpuPw.test(uPw)){
            
            alert("비밀번호는 5~12자리 영문과 숫자로만 입력해주세요.")
            form.uPw.select()
            return
         }
            
         if (uPw != uPw2) {
                 alert("입력하신 두 비밀번호가 맞지 않습니다.");
                 form.uPw.focus();
                 return 
         }
           
          //아이디와 비밀번호가 같을 때..
/*           if (uId == uPw) {
              alert("아이디와 비밀번호는 같을 수 없습니다!");
              form.uPw.value = "";
              form.uPw2.value = "";
              form.uPw.focus();
              return false;
          } */
/*           return true; //확인이 완료되었을 때
      }  */
      
      
      var regExpuName = /^[가-힣]{2,10}$/
      var uName =form.uName.value
      if(!regExpuName.test(uName)){
         
         alert("이름은 필수 입력사항 입니다. 이름은 한글로 입력해주세요.")
         form.uName.select()
         return
      }
      
      var regExpuEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i
      var uEmail = form.uEmail.value 
      if(!regExpuEmail.test(uEmail)){
         
         alert("이메일은 필수 입력사항 입니다. 이메일을 확인해주세요.")
         form.uEmail.select()
         return
      }
      
      var regExpuPhone1 = /^[0-9]{3,4}$/
         var uPhone1 = form.uPhone1.value 
         if(!regExpuPhone1.test(uPhone1)){
            
            alert("전화번호 앞자리를 확인해주세요.")
            form.uPhone1.select()
            return
      }
      
      var regExpuPhone2 = /^[0-9]{4}$/
         var uPhone2 = form.uPhone2.value 
         if(!regExpuPhone2.test(uPhone2)){
            
            alert("전화번호 뒷자리를 확인해주세요.")
            form.uPhone2.select()
            return
         }
      
      var regExpuAccount = /^[0-9]{10,25}$/
         var uAccount = form.uAccount.value 
         if(!regExpuAccount.test(uAccount)){
            
            alert("본인계좌는 필수 입력사항 입니다. 본인계좌를 확인해주세요.")
            form.uAccount.select()
            return
         }
      
      form.submit()
      
      
      
   }
   </script>
   <h1>회원가입</h1><br><hr class="dropdown-divider"><br>
<!--    <form action="addfinish.do" method="get" onsubmit="return checkAll()"> -->
      <form action="addfinish.do" name = "member" method="get">
      <table>
         <tr height="7">
            <td colspan="4"><hr /></td>
         </tr>
         <tr>
            <td>
            	<div class = "adduser_table">아이디</div>
            </td>
            <td>
            	<div class = "adduser_table"><input type="text" size ="27" placeholder=" 공백없는 5~12자리 영문/숫자 조합" id="inputID" name="uId" onkeydown="inputIdChk()"></div>
            </td>
            <td>
            	<div class = "adduser_table"><a href="idcheck.do"><input type="button" class="btn btn-secondary" name="check" value="중복체크" size="5"></a></div>
            </td>
         </tr>
         <tr>
            <td>
            	<div class = "adduser_table">비밀번호</div>
            </td>
            <td>
            	<div class = "adduser_table"><input type="password" size ="27" placeholder=" ******" id="inputPW" name="uPw"></div>
            </td>
            <td>
            	<div class = "adduser_table">공백없는 5~12자리 영문/숫자 조합</div>
            </td>
         </tr>
         <tr>
            <td>
           		<div class = "adduser_table">비밀번호 확인</div>
            </td>
            <td>
            	<div class = "adduser_table"><input type="password" size ="27" placeholder=" ******" id="inputPW2" name="uPw2"></div>
            </td>
         </tr>
         <tr>
            <td>
            	<div class = "adduser_table">이름</div>
            </td>
            <td>
            	<div class = "adduser_table"><input type="text" size ="27" placeholder=" 홍길동" id="inputNAME" name="uName"></div>
            </td>
         </tr>
          <tr>
            <td>
            	<div class = "adduser_table">이메일</div>
            </td>
            <td>
            	<div class = "adduser_table"><input type="text" size ="27" id="inputEMAIL" name="uEmail" placeholder=" abc@naver.com"></div>
            </td>
         </tr>
          <tr>
            <td>
            	<div class = "adduser_table">휴대폰번호</div>
            </td>
            <td>
            	<div class = "adduser_table">010-<input type="text" placeholder=" 1234" id="inputPHONE1" name="uPhone1" size="5">-<input type="text" id="inputPHONE2" name="uPhone2" placeholder=" 5678" size="5"></div>
            </td>
         </tr>
          <tr>
            <td>
             <div class = "adduser_table">본인계좌</div>
            </td>
            <td>
            	<div class = "adduser_table">
	            <select name="uBank">
		            <option  selected="selected">국민</option>
		            <option>신한</option>
		            <option>농협</option>
		            <option>하나</option>
		            <option>기업</option>
	            </select>
            	<input type="text" size ="18" id="inputACCOUNT" name="uAccount" placeholder="  123456789">
            	</div>
            </td>
            <td>
            	<div class = "adduser_table">계좌번호 입력시 - 없이 숫자만 입력해주세요</div>
            </td>
   		 </tr>
          <tr>
            <td>
            	<div class = "adduser_table">주소</div>
            </td>
            <td>
            	<div class = "adduser_table"><input type="text" size ="27" name="uAddress" placeholder="  서울특별시 강남구..."></div>
            </td>
         </tr>
         
<!--     <form action="form" id="form" method="post">
<div id="list"></div>
<div id="callBackDiv"></div>   
<div>주소 : <input type="text"  style="width:50px;" id="zipNo"  name="zipNo" />
<button type="button" onClick="goPopup();"> 주소찾기</button></div>
 <div style="padding-left: 2.9em"><div><input type="text"  style="width:300px;" id="address"  name="address" placeholder="위에 주소찾기 버튼을 눌러주세요."/></div>
</div>         

</form>  -->
         
         <tr>
	         <td></td>
	         <td><input type="button" class="btn btn-secondary" value="가입하기" onclick="checkMember()"></td>
	         <td><input type="reset" class="btn btn-secondary" name="reset" value="다시 입력"></td>
          </tr>
      </table>
    </form>
</div>

<script type="text/javascript">
var isCheckConfirmPasswd = false;

function checkConfirmPasswd(confirmPasswd) {
	var passwd = document.fr.passwd.value;
	
	var span_checkConfirmPasswdResult = document.getElementById("checkConfirmPasswdResult");
	
	if(passwd == confirmPasswd) {
		span_checkConfirmPasswdResult.innerHTML = "비밀번호 일치";
		span_checkConfirmPasswdResult.style.color = "BLUE";
		
		isCheckConfirmPasswd = true;
	} else {
		span_checkConfirmPasswdResult.innerHTML = "비밀번호 불일치";
		span_checkConfirmPasswdResult.style.color = "RED";

		isCheckConfirmPasswd = false;
	}
}




</script>



<script>

function goPopup(){
   // 주소검색을 수행할 팝업 페이지를 호출합니다.
   // 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(https://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
   var pop = window.open("/Test/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
    
}

function jusoCallBack(zipNo,roadFullAddr){
         var zipNoEl = document.querySelector("#zipNo");
         var addressEl = document.querySelector("#address");
         zipNoEl.value=zipNo;
         addressEl.value=roadFullAddr;
      
}

</script>
	
	<!-- End -->
	
	<!-- Footer start -->
	<footer >
		<div class="card" style="background-color: #696464; color: #E9E5DD;">
			<div class="card-body text-left mt-4" style="background-color: #696464;">
				<h3><a href="serviceCenter.do" style="text-decoration : none; color : white;">고객센터   <i class="fa-solid fa-house-user"></i></a></h3>
				<h6 class="card-title mt-3 mb-3">상담시간: 평일 09:00~17:30 (점심시간 12:00~13:00) / 주말 & 공휴일 휴무</h6><br>				
				<h1>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-facebook"></i></a> 
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-instagram"></i></a>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-youtube"></i></a>
					<a href="facebook.com" style="text-decoration : none; color : white;"><i class="fa-brands fa-twitter"></i></a>
				</h1>
				<br>
				<hr class="dropdown-divider"><br>
				<p class="card-text mt-4 mb-4">
				상호명 : (주) 시디즈<br>
				대표이사 : 이승민 <br>
				개인정보보호책임자 : 한수연<br>
				주소 : 서울 강동구 천호대로157길 14, 6층 (천호동, 나비빌딩)<br>
				사업자등록번호 : 156-80-12341 <br>
				사업자정보확인 통신판매업신고번호 : 제 5004-00123</p><br>
				<hr class="dropdown-divider">
			</div>
			<div class="card-body text-center">
				<p class="card-text mb-3">Copyright &copy; <script>document.write(new Date().getFullYear());</script> ALL rights reserved.</p>
			</div>
			<div class="card-footer text-center text-muted mt-2 mb-2"><br>
				<a href="#Top" class="btn btn-outline-secondary">맨 위로 가기 <i class="fa-solid fa-angles-up"></i></a>
			</div>
		</div>
	</footer>
	<!-- Footer End -->
</body>
</html>