window.onload = function () {
    getDishHtml();
};

async function getDishHtml() {
    var category = JSON.parse(getCookie("category"));

    var controller = new DishController();
    let html = await controller.getCategoryDish(JSON.stringify(category.dishes));

    var element = document.getElementById("dishContainer");
    element.innerHTML = html;
}

function getCookie(name)
{
    var matches = document.cookie.match(new RegExp(
        "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
    ));
    return matches ? decodeURIComponent(matches[1]) : undefined;
};

function categoryClick(categoryId) {
    document.location.href = "/view/dishes.html?id=" + categoryId;
}

function clickNavbarMenu() {
    $('.navbar-toggler').on('click', function(event) {
        event.preventDefault();
        $(this).closest('.navbar-minimal').toggleClass('open');
    })
};