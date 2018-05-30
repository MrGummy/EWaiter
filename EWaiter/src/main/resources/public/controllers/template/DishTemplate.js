class DishTemplate {

    templ() {
        var template = '{{#each dishes}}' +
            '<div class="row dishContent">' +
            '<div><img class="dishImg" src="{{photos[0].url}}"/></div>' +
            '<div class="dishLabel">' +
            '<label>Название: {{name}}</label>' +
            '<p class="dishP"><b>Описание:</b> {{description}}</p>' +
            '<p><b>Вес:</b> {{weight}} гр.</p>' +
            '<p><b>Время приготовления:</b> {{cookTime}}</p>' +
            '<p style="color: #cf4137;"><b>        Цена:</b> {{price}} <img src="../images/rouble_sign.gif" class="ruble-img" /><span class="dot">руб.</span></p>' +
            '</div>' +
            '</div>' +
            '{{/each}}';

        return template;
    }
}