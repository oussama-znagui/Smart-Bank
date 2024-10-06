const projectReg = document.getElementsByName("project")



const modal = document.getElementById("modal")
const closeModal = document.getElementById("closeModal")

const email = document.getElementsByName("email")[0]
const tel = document.getElementsByName("tel")[0]


function numsRegex() {

        var numberRegex = /^\d+$/;
// Validate numbers
        console.log(amount.value)
        console.log(duration.value)
        console.log(monthly.value)
        if (! numberRegex.test(amount.value) || ! numberRegex.test(duration.value) ){
            modal.style.display = "block"
            return false
        }
        return true

}




function telEmailRegex(){
    let EmailReg = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/
    
    if (!EmailReg.test(email.value)){
        modal.style.display = "block"
       // modal.innerHTML += "<p> Email invalid </p>"
        return false
    }

    return true
}


closeModal.addEventListener("click",(event) => {
    modal.style.display = "none"
})