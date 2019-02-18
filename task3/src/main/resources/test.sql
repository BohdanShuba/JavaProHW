select clients.surname, clients.name, clients.phone, products.name, products.price
from orders
inner join clients on clients.id = orders.id_clients
inner join products on products.id = orders.id_products
ORDER BY surname
