F<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%------------------------------------------------------------%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/profileDesireList.css">
</head>
<body>
<header>
    <div class="menu">
        <div class="container menu-container">
            <div class="menu-logo">
                <div class="menu-logo-icon">D</div>
                <div class="menu-logo-text-container">
                    <a href="index.html" class="menu-logo-text menu-logo-text-up">Dream.Co</a><br>
                    <a href="index.html" class="menu-logo-text menu-logo-text-down">make it happen</a>
                </div>
            </div>
            <a href="index.html" class="menu-item menu-item-1">Home</a>
            <a href="dreams.html" class="menu-item menu-item-1">Dreams</a>
            <a href="profile.html" class="menu-item menu-item-1">Profile</a>
            <button class="menu-item menu-item-logOut">Log out</button>
        </div>
    </div>
</header>
<div class="middle container">
    <div class="user-data">
        <div class="user-photo-block">
            <!--<div class="photo-tool">
                <span class="glyphicon glyphicon-plus-sign"></span>
                <span class="glyphicon glyphicon-remove-sign"></span>
            </div>-->
            <div class="user-photo">
                <div class="fa fa-user"></div>
            </div>
            <div class="photo-control">
                <button class="">add </button>
                <button class="">delete </button>
            </div>
        </div>
        <div class="user-info">
            <table>
                <tr>
                    <td>Born:</td>
                    <td>02.10.1994</td>
                </tr>
                <tr>
                    <td>Country:</td>
                    <td>Ukraine</td>
                </tr>
                <tr>
                    <td>City:</td>
                    <td>Kyiv</td>
                </tr>
                <tr>
                    <td>Work:</td>
                    <td>student</td>
                </tr>
            </table>
        </div>
        <div class="user-name">
            <div>David Guetta</div>
            <div class="user-tools">
                <a href="#" class="fa fa-envelope">
                    <span class="massageNumber">10</span>
                </a>
                <a href="#" class="fa fa-handshake-o">
                    <span class="dealNumber">10</span>
                </a>
            </div>
        </div>
    </div>
    <div class="user-dreams table-responsive">
        <div class="dreamsList">
            My Dreams list
        </div>
        <section>
            <form method="post" action="desires?action=filter">
                <div class="filter">
                    <span class="fa fa-filter"></span>
                    <input class="form-control" type="text" name="category" placeholder="Enter category" value="${desireCategory}">
                    <button type="submit">Filter</button>
                </div>
            </form>
            <table class="table table-striped" border="1" cellpadding="8" cellspacing="0">
                <thead>
                <tr>
                    <th>Date</th>
                    <th>Desire</th>
                    <th>Barter</th>
                    <th>Category</th>
                    <th></th>
                    <th><a href="desires?action=create"><span id="addDreamIcon" class="fa fa-plus"></span></a></th>
                </tr>
                </thead>
                <c:forEach items="${desireList}" var="barter">
                    <jsp:useBean id="barter" scope="page" type="dreamco.project.model.Desire"/>
                    <tr>
                        <td>${barter.dateTime.toLocalDate()} ${barter.dateTime.toLocalTime()}</td>
                        <td>${barter.desireDescription}</td>
                        <td>${barter.barterPropose}</td>
                        <td>${barter.categories}</td>
                        <td><a href="desires?action=update&id=${barter.id}"><span class="fa fa-edit"></span></a> </td>
                        <td><a href="desires?action=delete&id=${barter.id}"><span class="fa fa-close"></span></a> </td>
                    </tr>
                </c:forEach>
            </table>
        </section>
    </div>
</div>
<footer>
    <div class="footer-content container">
        <div class="projected">
            <table>
                <tr>
                    <td>Projected by:</td>
                    <td><span class="fa fa-user-circle-o"></span>Darya Makarova</td>
                </tr>
                <tr>
                    <td></td>
                    <td><span class="fa fa-user-circle-o"></span>Artem Vorov</td>
                </tr>
            </table>
        </div>
        <div class="aboutUs">
            <a href="">About Us:</a>
        </div>
        <div class="help">
            <span href="">Help:</span>
            <table>
                <tr>
                    <td><span class="fa fa-envelope"></span></td>
                    <td><a href="darya.aleks.mak@gmail.com">darya.aleks.mak@gmail.com</a></td>
                </tr>
                <tr>
                    <td> <span class="fa fa-phone"></span></td>
                    <td><a href="">09670445991</a></td>
                </tr>
            </table>
        </div>
        <div class="contact">
            <a href="">Contact:</a>
            <div class="contact-icons">
                <a href="#" class="fa fa-vk"></a>
                <a href="#" class="fa fa-twitter"></a>
                <a href="#" class="fa fa-skype"></a>
            </div>
        </div>
    </div>
</footer>

<!------------------------JS----------------------------->
<script src="jquery/jquery-3.1.0.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>
<%------------------------------------------------------------%>
<%--<html>
<head>
    <title>User barter</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/dreams.css">
</head>
<body>
<section>
<h2><a href="index.html">Home</a></h2>
<h2>User barter</h2>
    <form method="post" action="desires?action=filter">
        <dl>
            <dt>Category:</dt>
            <dd><input type="text" name="category" value="${desireCategory}"></dd>
        </dl>
        <button type="submit">Filter</button>
    </form>
    <hr>
<a href="desires?action=create">Add barter</a>
<hr>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>Date</th>
        <th>Desire</th>
        <th>Barter</th>
        <th>Category</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <c:forEach items="${desireList}" var="barter">
        <jsp:useBean id="barter" scope="page" type="dreamco.project.model.Desire"/>
        <tr>
            <td>${barter.dateTime.toLocalDate()} ${barter.dateTime.toLocalTime()}</td>
            <td>${barter.desireDescription}</td>
            <td>${barter.barterPropose}</td>
            <td>${barter.categories}</td>
            <td><a href="desires?action=update&id=${barter.id}">Update</a> </td>
            <td><a href="desires?action=delete&id=${barter.id}">Delete</a> </td>
        </tr>
    </c:forEach>
</table>
</section>
</body>
</html>--%>
