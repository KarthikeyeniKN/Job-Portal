<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.hide {
    display: none;
}</style>
</head>
<body>
<ul id="menu" class="menu no-bullet" >
    <li><a id="information-link" href="#"><h3> Information </h3> </a></li>
    <li><a id="portfolio-link"href="#"><h3> Portfolio </h3> </a></li> 
    <li><a id="blog-link" href="#"><h3> Blog </h3> </a></li>
    <li><a id="contact-link" href="#"><h3> Contact Me </h3> </a></li>
</ul>

<div id="pages">
    <div id="information" class="page">
        <div class="row">
            <div class="columns large-6">
                <h1> About Me </h1>
                <p> Lorem ipsum information </p>
            </div>
        </div>
    </div>
    <div id="portfolio" class="page hide">
        <div class="row">
            <div class="columns large-6">
                <h1> Portfolio </h1>
                <p> Lorem ipsum portfolio </p>
            </div>
        </div>
    </div>
    <div id="blog" class="page hide">
        <div class="row">
            <div class="columns large-6">
                <h1> Blog </h1>
                <p> Lorem ipsum blog </p>
            </div>
        </div>
    </div>
    <div id="contact" class="page hide">
        <div class="row">
            <div class="columns large-6">
                <h1> Contact Me </h1>
                <p> Lorem ipsum contact </p>
            </div>
        </div>
    </div>
</div>
<script>
/* $(document).ready(function() {
    $("#information-link").on('click', function() {
        $("#pages .page:not('.hide')").stop().fadeOut('fast', function() {
            $(this).addClass('hide');
            $('#information').fadeIn('slow').removeClass('hide');
        });
    });
    $("#portfolio-link").on('click', function() {
        $("#pages .page:not('.hide')").stop().fadeOut('fast', function() {
            $(this).addClass('hide');
            $('#portfolio').fadeIn('slow').removeClass('hide');
        });
    });
    $("#blog-link").on('click', function() {
        $("#pages .page:not('.hide')").stop().fadeOut('fast', function() {
            $(this).addClass('hide');
            $('#blog').fadeIn('slow').removeClass('hide');
        });
    });
    $("#contact-link").on('click', function() {
        $("#pages .page:not('.hide')").stop().fadeOut('fast', function() {
            $(this).addClass('hide');
            $('#contact').fadeIn('slow').removeClass('hide');
        });
    });
}); */
$(document).ready(function() {
    $("#menu li a").on('click', function() {
        var page = $(this).data('page');
        $("#pages .page:not('.hide')").stop().fadeOut('fast', function() {
            $(this).addClass('hide');
            $('#pages .page[data-page="'+page+'"]').fadeIn('slow').removeClass('hide');
        });
    });
});
</script>
</body>
</html>