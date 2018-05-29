class DishTemplate {

    templ() {
        var template = '{{#each dishes}}' +
            '<div class="row post-content">' +
            '<div><img class="dishImg" src="{{photos[0].url}}"/></div>' +
            '<div class="sectionsLabel">' +
            '<label>Название: {{name}}</label>' +
            '<p><b>Описание:</b> {{description}}</p>' +
            '<p><b>Вес:</b> {{weight}} гр.</p>' +
            '<p><b>        Цена:</b> {{price}} <img src="../images/ruble.gif" class="ruble-img" /><span class="dot">руб.</span></p>' +
            '</div>' +
            '</div>' +
            '{{/each}}';

        return template;
    }
}