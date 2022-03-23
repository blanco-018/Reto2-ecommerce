package Reto2.BackEnd.Web.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Reto2.BackEnd.Repositories.Entities.OrderEntity;
import Reto2.BackEnd.Repositories.Entities.OrderProductEntity;
import Reto2.BackEnd.Repositories.Entities.ProductEntity;
import Reto2.BackEnd.Repositories.Interfaces.OrderProductRepository;
import Reto2.BackEnd.Repositories.Interfaces.OrderRepository;
import Reto2.BackEnd.Repositories.Interfaces.ProductRespository;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(ProductRespository productRepository, OrderRepository orderRepository, OrderProductRepository orderProductRepository){
        return args -> {
            productRepository.save(new ProductEntity("Ak-47", 3000, "https://elordenmundial.com/wp-content/webp-express/webp-images/doc-root/wp-content/uploads/2021/11/AK-47-fusil-de-asalto-Avtomat-Kalashnikova.jpg.png.webp"));
            productRepository.save(new ProductEntity("Munición", 250, "https://static9.depositphotos.com/1011084/1089/i/950/depositphotos_10894496-stock-photo-scratched-ammunition.jpg"));
            productRepository.save(new ProductEntity("ChalecoAntibalas", 500, "https://w7.pngwing.com/pngs/124/29/png-transparent-bullet-proof-vests-bulletproofing-gilets-flak-jacket-carrier-corporation-bullet-proof-vests-bulletproofing-flak-jacket.png"));
            productRepository.save(new ProductEntity("Pack Granadas", 1000, "https://w7.pngwing.com/pngs/54/958/png-transparent-hg-85-m67-grenade-fragmentation-swiss-armed-forces-hand-grenade-weapon-grenade-launcher-m26-grenade.png"));
            productRepository.save(new ProductEntity("M4", 7000, "https://w7.pngwing.com/pngs/501/952/png-transparent-assault-rifle-m4-carbine-firearm-ak-47-assault-rifle.png"));



            orderProductRepository.save(new OrderProductEntity((long)1, (long)1, 1));
            orderProductRepository.save(new OrderProductEntity((long)2, (long)1, 2));
            orderProductRepository.save(new OrderProductEntity((long)1, (long)2, 2));
            orderProductRepository.save(new OrderProductEntity((long)2, (long)2, 1));

            orderRepository.save(new OrderEntity("08/03/2022", "Ana", "Activo"));
            orderRepository.save(new OrderEntity("03/08/2021", "Visco", "En Espera"));

        };
    }
}
