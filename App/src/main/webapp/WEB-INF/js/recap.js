

    const toStep2 = document.getElementById("toStep2")
    const toStep3 = document.getElementById("toStep3")

    const amountRang = document.getElementById("amount")
    const durationRang = document.getElementById("duration")
    const monthlyRang = document.getElementById("monthly")

    const project = document.getElementById("project")
    const pro = document.getElementById("pro")

    const recapTable = document.getElementById("racaptable")
    console.log("rcapp ------------>" + recapTable)
    console.log("amount from recap " + amountRang.value)

    const step1 = document.getElementById("step1")



    //--------------------------------------------------
    let a = amountRang.value


    toStep2.addEventListener("click" ,(event)=>{



        recapTable.innerHTML +=
            `<thead>
                <td>
                   Details de mon credit
                </td>
                </thead>

                <tbody class="creditData" id="creditData">

                   <tr>
                   <td>
                       Montant:
                    </td>
                     <td> `
                        + amountRang.value +
            `     DHS </td>
                   </tr>
                   <tr>
                   <td>
                        Durée:
                    </td>
                     <td> `
                        + durationRang.value +
            ` Mois</td>
                   </tr>
                   <tr>
                   <td>
                     Mensualité:
                    </td>
                     <td>
                        ` + monthlyRang.value+`
                    </td>
                   </tr>
                   <tr>
                   <td>
                       Frais de dossier:
                    </td>
                     <td>
                        200 DHS
                    </td>
                   </tr>
                 

                </tbody>`;


    })


    step1.addEventListener("click",(event) =>{
        const creditData = document.getElementById("creditData")
        creditData.remove()


    })






