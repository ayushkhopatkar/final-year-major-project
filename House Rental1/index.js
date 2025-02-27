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
    let index = 0;
      const images = document.querySelectorAll("#image-container img");
      
      function showImage(n) {
          images.forEach(img => img.classList.add("hidden")); // Hide all images
          images[n].classList.remove("hidden"); // Show the selected image
      }
      
      function plusDivs(n) {
          index = (index + n + images.length) % images.length; // Loop images
          showImage(index);
      }
      
      // Show first image initially
      showImage(index);