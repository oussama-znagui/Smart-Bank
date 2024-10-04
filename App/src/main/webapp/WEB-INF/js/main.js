





document.addEventListener("DOMContentLoaded", function() {

    displayForm()

    const amount = document.getElementById("amount")
    const amountRang = document.getElementById("amount-rang")
    const duration = document.getElementById("duration")
    const durationRang = document.getElementById("duration-rang")
    const monthlyRang = document.getElementById("monthly-rang")
    const monthly = document.getElementById("monthly")



    amountRang.addEventListener("input", (event) => {

        console.log("range value --> " + amountRang.value)
        console.log("amount --> " + amount.value)
        amount.setAttribute("value",amountRang.value)
      amount.value = amountRang.value

      let m =  calculateMountly(amountRang.value,durationRang.value)

        monthlyRang.setAttribute("min", calculateMinMountly(amountRang.value))

        monthlyRang.setAttribute("max",calculateMaxMountly(amountRang.value))

        monthly.setAttribute("value",m)
        monthly.value = m




    });



    durationRang.addEventListener("change",(event)=>{
        duration.value = durationRang.value
        let m =  calculateMountly(amountRang.value,durationRang.value)
        monthlyRang.value = m
        monthly.value = m

    })


    monthlyRang.addEventListener("change",(event) => {
        monthly.setAttribute("value",monthlyRang.value)
        monthly.value = monthlyRang.value
        let dur = calculateDuration(amount.value,monthly.value)
        duration.setAttribute("value",dur)
        durationRang.setAttribute("value",dur)
        duration.value = dur
        durationRang.value = dur



    })

    monthly.addEventListener("change",(event) =>{
        monthlyRang.value = monthly.value
    })



});


//Mountly ----------------------------------------------------------


function calculateMountly(amount,duration){


    let a1 = amount * (0.1 / 12)
    console.log(a1)
    let a2 = (1 +  (0.1 / 12))
    console.log(a2)
    let a2pow = 1 - Math.pow(a2, -duration)

    console.log(a2pow)
    let mVal = a1 /a2pow

   return mVal
}

function calculateMinMountly(amount){
    return  calculateMountly(amount,120)
}

function calculateMaxMountly(amount){
    return calculateMountly(amount,12)
}

//duration
function calculateDuration(amount,mountly){
    console.log("fromcalculateDuration ---------> " + amount)
    console.log("fromcalculateDuration ---------> " + mountly)
    let p1 = Math.log(1-((amount*(0.1/12))/mountly))
    let p2 =  Math.log(1+(0.1/12))
    let dur = Math.round(p1/-p2)
    return dur
}

//displat form ----------------------------------------------------------------------

function displayForm(){
    const p1 = document.getElementById("p1")
    const p2 = document.getElementById("p2")
    const p3 = document.getElementById("p3")
    const toStep2 = document.getElementById("toStep2")
    const toStep3 = document.getElementById("toStep3")
    p2.style.display = "none"
    p3.style.display = "none"

    toStep2.addEventListener("click",(event) => {
        p1.style.display = "none"
        p2.style.display = "block"

    })

    toStep3.addEventListener("click",(event) => {
        p2.style.display = "none"
        p3.style.display = "block"

    })
}



