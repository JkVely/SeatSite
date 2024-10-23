document.addEventListener('DOMContentLoaded', function() {
    const switchElement = document.getElementById('switch');

    // Add an event listener to the checkbox input
    switchElement.addEventListener('change', function() {
        if (switchElement.checked) {
            document.body.classList.add('dark-mode');
        } else {
            document.body.classList.remove('dark-mode');
        }
    });
});

document.addEventListener('DOMContentLoaded', function() {
    const loginButton = document.getElementById('login');
    const roleSelect = document.getElementById('role-select');

    loginButton.addEventListener('click', function() {
        const selectedRole = roleSelect.value;

        if (selectedRole === 'admin') {
            window.location.href = './admin/login.html'; // URL de inicio de sesión para administradores
        } else if (selectedRole === 'user') {
            window.location.href = './user/login.html'; // URL de inicio de sesión para usuarios
        }
    });
});

document.addEventListener('DOMContentLoaded', function() {
    const loginButton = document.getElementById('register');
    const roleSelect = document.getElementById('role-select');

    loginButton.addEventListener('click', function() {
        const selectedRole = roleSelect.value;

        if (selectedRole === 'admin') {
            window.location.href = './admin/register.html'; // URL de inicio de sesión para administradores
        } else if (selectedRole === 'user') {
            window.location.href = './user/register.html'; // URL de inicio de sesión para usuarios
        }
    });
});