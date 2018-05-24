class CompanyController {
    constructor() {
        this.companyService = new CompanyService();
    }

    getAllCompany() {
        return this.companyService.getAllCompany();
    }

    async getAllCompanyList() {
        let response = await this.getAllCompany();
        return response;
    }
}