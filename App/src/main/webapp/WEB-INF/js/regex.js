const project = document.getElementsByName("project")
const pro = document.getElementsByName("pro")
const amount = document.getElementsByName("amount")
const duration = document.getElementsByName("duration")
const project = document.getElementsByName("monthly")

const toStep2 = document.getElementById("toStep2")

toStep2.addEventListener("click",(event) =>{
    if(amount.test(" /^\\d+$/;")){
        console.log("noo")
    }
})