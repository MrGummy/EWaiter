class MenuService {

    getAllMenu() {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/menu/selectAll",
            async: true
        });
    }
}