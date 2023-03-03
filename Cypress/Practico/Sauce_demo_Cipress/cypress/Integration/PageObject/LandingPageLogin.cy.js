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