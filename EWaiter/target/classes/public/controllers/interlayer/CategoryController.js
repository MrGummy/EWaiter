class CategoryController {
    constructor() {
        this.categoryService = new CategoryService();
    }

    // DATAController
    async getAllCategory() {
        let categories = await this.categoryService.getAllCategory();

        var template = $('#TemplateCategory').html();
        var compiledTemplate = Template7.compile(template);
        var context ={categories : categories};
        var html = compiledTemplate(context);
        return html;
    }
}