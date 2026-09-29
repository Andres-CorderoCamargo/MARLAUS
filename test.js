// Menu burger :
const burgerBtn = document.getElementById('burger-btn');
const navMenu = document.getElementById('nav-menu');

burgerBtn.addEventListener('click', () => {
    burgerBtn.classList.toggle('active');
    navMenu.classList.toggle('active');
});

document.querySelectorAll('.nav-menu a').forEach(link => {
    link.addEventListener('click', () => {
        burgerBtn.classList.remove('active');
        navMenu.classList.remove('active');
    });
});

// Imagenes que cambian
const imagenes = [
    'imagen1.jpg',
    'imagen2.jpg',
    'imagen3.jpg'
];

let indiceActual = 0;
const imgElement = document.getElementById('carousel-img');

function cambiarImagen() {
    imgElement.style.opacity = '0';

    setTimeout(() => {
        indiceActual = (indiceActual + 1) % imagenes.length;
        imgElement.src = imagenes[indiceActual];
        imgElement.style.opacity = '1';
    }, 500);
}

// Cambia de imagen cada 4 segundos (4000 ms)
setInterval(cambiarImagen, 4000);