class LandingPageLogin{

    username(){
        return cy.get("[name ='username']")
    }
    password(){
        return cy.get("[type ='password']")
    }
    btnLogin(){
        return cy.get("[type='submit']")
    }
}
export default LandingPageLogin

//npm run html-reporte
//"html-reporte":"Cypress run --spec cypress/e2e/Test/PageLogin.cy.js --browser chrome --headed",

//"cypress:runChromeHeadless":"Cypress run --headless --browser chrome --spec cypress/e2e/Test/PageLogin.cy.js --record --key 379785f9-8de1-4a7c-8dfa-4f243bfebcea"
//npm run cypress:runChromeHeadless