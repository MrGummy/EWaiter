class TemplateMenu {

    templ() {
        var template = '{{#each menus}}' +
            '<div class="row post-content">' +
            '<div class="sectionsImg1"></div>' +
            '<div class="sectionsLabel">' +
            '<label>Название: {{name}}</label>' +
            '<p><b>Описание:</b> {{description}}</p>' +
            '</div>' +
            '</div>' +
            '<br/>' +
            '{{/each}}';

        return template;
    }
}