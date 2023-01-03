window.addEventListener("load",function(){
    let div = document.querySelector("div");

fetch("Bread.json")
    .then(Response => Response.json())
    .then((data) => {

        data.forEach(element => {

            let breadType = element.breadType;
            let breadRecipe = element.recipe;
            
            if(breadType == 'cream')
                addRecipe = breadRecipe.cream;
            else if (breadType == 'sugar')
                addRecipe = breadRecipe.sugar;
            else if (breadType == 'butter')
                addRecipe = breadRecipe.butter;

            let template = 
            `
            <div>breadType: ${breadType}
                <div>
                recipe
                    <div>flour: ${element.recipe.flour}</div>
                    <div>water: ${element.recipe.water}</div>
                    <div>${breadType}: ${addRecipe}</div>
                </div>
            </div>
            <br>
            `

            let el = document.createElement('div');
            el.innerText = template;

            div.insertAdjacentHTML("beforebegin", template);

            console.log(element);
            
        });
    
    });

})