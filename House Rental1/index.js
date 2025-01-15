   let section = document.querySelectorAll('section');
    let navLink = document.querySelectorAll('nav a');
    window.onscroll =() =>{
        section.forEach(sec  =>{
            let top = window.scrollY;
            let offset = sec.offsetTop  -150;
            let height = sec.offsetHeight;
            let id = sec.getAttribute('id');
            if(top >= offset && top < offset + height){
                navLink.forEach(links =>{
                    document.querySelector('nav a [href*='+ id +']').classList.add('active');
                });
            };

        });
    };