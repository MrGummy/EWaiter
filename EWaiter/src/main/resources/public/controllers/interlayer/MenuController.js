class MenuController {
    constructor() {
        this.menuService = new MenuService();
        this.templateMenu = new TemplateMenu();
    }

    getMenuByCompanyId(id) {
        return this.menuService.getMenuByCompanyId(id);
    }

    getTemlateMenu() {
        return this.templateMenu.templ();
    }

    async getCompanyMenu(json) {
        var menus = JSON.parse(json);

        var template = this.getTemlateMenu();
        var compiledTemplate = Template7.compile(template);
        var context = {menus: menus};
        var html = compiledTemplate(context);

        return html;
    }
}