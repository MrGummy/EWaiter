window.onload = function () {
    getCategoryHtml();
};

async function getCategoryHtml() {
    var url = new URL(document.location.href);
    var menuId = url.searchParams.get("id");

    var company = JSON.parse(getCookie("company"));
    for (var i = 0; i < company.menus.length; i++)
    if (menuId == company.menus[i].id)
    {
        var controller = new CategoryController();
        let html = await controller.getMenuCategory(JSON.stringify(company.menus[i].categories));

        var element = document.getElementById("categoryContainer");
        element.innerHTML = html;
    }
}

function getCookie(name)
{
    var matches = document.cookie.match(new RegExp(
        "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
    ));
    return matches ? decodeURIComponent(matches[1]) : undefined;
};

function categoryClick(categoryId) {
    var menu = JSON.parse(getCookie("menu"));

    for (var i = 0; i < menu.categories.length; i++) {
        if (categoryId == menu.categories[i].id) {
            document.cookie = "category=" + JSON.stringify(menu.categories[i]) + ";path=/";
        }
    }

    document.location.href = "/view/dishes.html?id=" + categoryId;
}

function clickNavbarMenu() {
    $('.navbar-toggler').on('click', function(event) {
        event.preventDefault();
        $(this).closest('.navbar-minimal').toggleClass('open');
    })
};