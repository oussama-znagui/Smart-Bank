
document.addEventListener("DOMContentLoaded", function() {

    const modals = document.querySelectorAll("div-[id^=m-]")


    const btns = document.querySelectorAll('button[id^=b-]')
    const fermer = document.querySelectorAll('button[id^=f-]')


    btns.forEach(btn => {

        btn.addEventListener('click', event => {

            const myArray = event.target.id.split("-");

            const modal = document.getElementById("m-"+myArray[1])
            modal.style.display = "block"
        })

    })


    fermer.forEach(f => {

        f.addEventListener('click', event => {

            const myArray = event.target.id.split("-");

            const modal = document.getElementById("m-"+myArray[1])
            modal.style.display = "none"
        })

    })
})