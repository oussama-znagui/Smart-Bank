const projectReg = document.getElementsByName("project")



const modal = document.getElementById("modal")
const closeModal = document.getElementById("closeModal")

const email = document.getElementsByName("email")[0]
const tel = document.getElementsByName("tel")[0]

const errors = document.getElementsByClassName("errors")[0]


//check data
function chekData(elements){
    return elements.every(el => {
        console.log(el.value);
        return el.value !== "";
    });
}

function openModal(errorsList){
    modal.style.display = "block"
    errorsList.forEach((error) => {
        let errorMessage = document.createElement("li")
        errorMessage.classList.add("errorMessage")
        errorMessage.textContent = error
        errors.appendChild(errorMessage)

    })

}



function numsRegex() {
    let arr = []
    let message = []
    arr.push(amount)
    arr.push(duration)
    if (!chekData(arr)){
        message.push("Veuillez completez toute les infos")

    }else {
        var numberRegex = /^\d+$/;
        if (! numberRegex.test(amount.value) || ! numberRegex.test(duration.value) ){
            message.push("valeur incorecte ")

        }
    }

    if(message.length != 0){
        openModal(message)
        return false

    }

    return true

}











function RegexMailTel(){
    let arr = []
    let message = []
    arr.push(email)
    arr.push(tel)
    if (!chekData(arr)){
        message.push("Veuillez completez toute les infos")
    }else {
        let EmailReg = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/
        let phoneRex = /^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/
        if (!EmailReg.test(email.value ) ){
            message.push("Email incorect ")
        }
        if (!phoneRex.test(tel.value)){
            message.push("tel incorect ")
        }

    }

    if(message.length != 0){
        openModal(message)
        return false

    }

    return true
}


closeModal.addEventListener("click",(event) => {
    modal.style.display = "none"
    errors.innerHTML = ""
})


