function clickNavbarMenu() {
    $('.navbar-toggler').on('click', function(event) {
        event.preventDefault();
        $(this).closest('.navbar-minimal').toggleClass('open');
    })
};

function menuClick() {
    document.location.href = "/view/menu.html";
}