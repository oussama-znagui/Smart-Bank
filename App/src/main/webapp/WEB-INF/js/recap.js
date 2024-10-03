document.addEventListener("DOMContentLoaded", function() {

    const toStep2 = document.getElementById("toStep2")
    const toStep3 = document.getElementById("toStep3")

    const amountRang = document.getElementById("amount-rang")
    const durationRang = document.getElementById("duration-rang")
    const monthlyRang = document.getElementById("monthly-rang")

    const project = document.getElementById("project")
    const pro = document.getElementById("pro")

    const recapTable = document.getElementById("racaptable")
    console.log("rcapp ------------>" + recapTable)
    console.log("amount from recap " + amountRang.value)


    //--------------------------------------------------
    let a = amountRang.value
    toStep2.addEventListener("click" ,(event)=>{

        recapTable.innerHTML +=
            `<thead>
                <td>
                   Details de mon credit
                </td>
                </thead>

                <tbody class="creditData">

                   <tr>
                   <td>
                       Montant:
                    </td>
                     <td> `
                        + a
            `      </td>
                   </tr>
                   <tr>
                   <td>
                        Pret Personnel
                    </td>
                     <td>
                        Pret Personnel
                    </td>
                   </tr>
                   <tr>
                   <td>
                        Pret Personnel
                    </td>
                     <td>
                        Pret Personnel
                    </td>
                   </tr>
                   <tr>
                   <td>
                        Pret Personnel
                    </td>
                     <td>
                        Pret Personnel
                    </td>
                   </tr>
                 

                </tbody>`;


    })
});





