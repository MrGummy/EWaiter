class MenuService {

    getMenuByCompanyId(id) {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/menu/selectByCompanyId/" + id + "",
            async: true
        });
    }

    insertMenu(json) {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/menu/insert/" + json + "",
            async: true
        });
    }
}