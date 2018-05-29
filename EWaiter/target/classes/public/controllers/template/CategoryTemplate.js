class CategoryTemplate {

    templ() {
        var template = '{{#each categories}}' +
            '<a class="animate" onclick="categoryClick({{id}})">' +
            '<div class="row post-content">' +
            '<img class="categoryImg" src="{{photo}}"/>' +
            '<div class="sectionsLabel">' +
            '<label>{{name}}</label>' +
            '</div>' +
            '</div>' +
            '</a>' +
            '{{/each}}';

        return template;
    }
}

