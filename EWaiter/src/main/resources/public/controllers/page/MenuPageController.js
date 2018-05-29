window.onload = function () {
    getMenuHtml();
}

async function getMenuHtml() {
    var company = JSON.parse(getCookie("company"));

    var controller = new MenuController();
    let html = await controller.getCompanyMenu(JSON.stringify(company.menus));

    var element = document.getElementById("menuContainer");
    element.innerHTML = html;
}

function clickNavbarMenu() {
    $('.navbar-toggler').on('click', function(event) {
        event.preventDefault();
        $(this).closest('.navbar-minimal').toggleClass('open');
    })
};

function oneMenuClick(menuId) {
    var company = JSON.parse(getCookie("company"));

    for (var i = 0; i < company.menus.length; i++) {
        if (menuId == company.menus[i].id) {
            document.cookie = "menu=" + JSON.stringify(company.menus[i]) + ";path=/";
        }
    }

    document.location.href = "/view/category.html?id=" + menuId;
}

function getCookie(name)
{
    var matches = document.cookie.match(new RegExp(
        "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
    ));
    return matches ? decodeURIComponent(matches[1]) : undefined;
};