class MenuController {
    constructor() {
        this.menuService = new MenuService();
        this.templateMenu = new TemplateMenu();
    }

    getAllMenu() {
        return this.menuService.getAllMenu();
    }

    getTemlateMenu() {
        return this.templateMenu.templ();
    }

    async getAllMenuView() {
        let response = await this.getAllMenu();
        var menus = JSON.parse(response);


        var template = this.getTemlateMenu();
        var compiledTemplate = Template7.compile(template);
        var context = {menus: menus};
        var html = compiledTemplate(context);

        alert(html);

        return html;
    }
}