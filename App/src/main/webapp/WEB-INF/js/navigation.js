console.log("bien")

document.addEventListener("DOMContentLoaded", function() {

    let step = 1;
    const step1 = document.getElementById("step1")
    const step2 = document.getElementById("step2")
    const step3 = document.getElementById("step3")

    const toStep2 = document.getElementById("toStep2")
    const toStep3 = document.getElementById("toStep3")

    const p1 = document.getElementById("p1")
    const p2 = document.getElementById("p2")
    const p3 = document.getElementById("p3")


        step1.classList.add("inprogress")


function tonext(){
    step ++
    step2.classList.add("inprogress")
    step1.classList.remove("inprogress")
    step1.classList.add("complited")
}

    toStep3.addEventListener("click",(event) => {
        step ++
        step3.classList.add("inprogress")
        step2.classList.remove("inprogress")
        step2.classList.add("complited")

    })







    step1.addEventListener("click",(event) =>{
        p1.style.display = "block"
        p2.style.display = "none"
        p3.style.display = "none"
        step = 1

        step1.classList.add("inprogress")
        step1.classList.remove("complited")
        step2.removeAttribute("class")
        step3.removeAttribute("class")


    })


    step2.addEventListener("click",(event) =>{
        if(step > 1){
            p1.style.display = "none"
            p2.style.display = "block"
            p3.style.display = "none"

            step1.classList.add("complited")
            step1.classList.remove("inprogress")

            step1.classList.remove("complited")
            step1.classList.add("inprogress")

            step3.removeAttribute("class")

        }
    })


    toStep2.addEventListener("click",(event) => {
        if(numsRegex()) {
            p1.style.display = "none"
            p2.style.display = "block"
            tonext()
        }


    })


    toStep3.addEventListener("click",(event) => {
        if(Regex()){
            p2.style.display = "none"
            p3.style.display = "block"

        }






    })



});