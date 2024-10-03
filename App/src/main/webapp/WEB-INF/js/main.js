





document.addEventListener("DOMContentLoaded", function() {

    displayForm()
    const amount = document.getElementById("amount")
    const amountRang = document.getElementById("amount-rang")
    const duration = document.getElementById("duration")
    const durationRang = document.getElementById("duration-rang")

    const monthlyRang = document.getElementById("monthly-rang")
    const monthly = document.getElementById("monthly")



    amountRang.addEventListener("change", (event) => {

        console.log("range value --> " + amountRang.value)
        console.log("amount --> " + amount.value)
      amount.value = amountRang.value
      let m =  calculateMountly(amountRang.value,durationRang.value)
        monthlyRang.setAttribute("min", calculateMinMountly(m))
        monthlyRang.setAttribute("max",calculateMaxMountly(m))
        console.log(calculateMaxMountly(m) + "-to-" + calculateMinMountly(m))

        monthlyRang.value = m
        monthly.value = monthlyRang.value
        console.log("------------>" + monthlyRang.value + "//" +monthly.value)
    });



    durationRang.addEventListener("change",(event)=>{
        duration.value = durationRang.value
        let m =  calculateMountly(amountRang.value,durationRang.value)
        monthlyRang.value = m
        monthly.value = m
    })


    monthlyRang.addEventListener("change",(event) => {
        monthly.value = monthlyRang.value
    })

    monthly.addEventListener("change",(event) =>{
        monthlyRang.value = monthly.value
    })



});


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
    return  calculateMountly(amount,12)
}

function calculateMaxMountly(amount){
    return calculateMountly(amount,120)
}


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



