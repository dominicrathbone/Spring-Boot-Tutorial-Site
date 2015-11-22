$(document).ready(function(){
  $('.carousel').slick({
    draggable: false,
    dots: true,
    speed: 300,
    adaptiveHeight: true,
    arrows: true
  });
});

$('#start-button').click(function(){
    $(".carousel").slick('slickNext');
});
