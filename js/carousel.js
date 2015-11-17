$(document).ready(function(){
  $('.carousel').slick({
    dots: true,
    speed: 300,
    adaptiveHeight: true,
    arrows: true
  });
});

$('#start-button').click(function(){
    $(".carousel").slick('slickNext');
});
