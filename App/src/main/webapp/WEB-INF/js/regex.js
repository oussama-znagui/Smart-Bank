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


function chekData(elements){
    return elements.every(el => {
        console.log(el.value);
        return el.value !== "";
    });


}
const errors = document.getElementsByClassName("errors")[0]

function Regex(){
    let arr = []
    arr.push(email)
    arr.push(tel)
    if (!chekData(arr)){
        modal.style.display = "block"
        let errorMessage = document.createElement("p")

           errorMessage.textContent = "veuillez completez toute les infos"

        errors.innerHTML = ""
        errors.appendChild(errorMessage)
        return false

    }
    return true


    // let EmailReg = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/
    // let phoneRex = /^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/
    // console.log(tel.value)
    // if (!EmailReg.test(email.value ) || !phoneRex.test(tel.value)){
    //
    //     let errorMessage = document.createElement("p")
    //     errorMessage.classList.add("errorMessage")
    //     errorMessage.textContent = "Email invalid"
    //
    //
    //
    //
    //     return false
    // }
    //
    // return true
}


closeModal.addEventListener("click",(event) => {
    modal.style.display = "none"
})