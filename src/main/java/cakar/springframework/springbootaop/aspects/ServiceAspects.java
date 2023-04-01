package cakar.springframework.springbootaop.aspects;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ServiceAspects {

    //@Before("execution(* cakar.springframework.springbootaop.service.MessageService.mesajVer(..))")
    @Before("execution(* cakar.springframework.springbootaop.service.*.*(..))")
    public void mesajVerBefore(JoinPoint joinPoint){
        //Genellikle service katmanında kullanılır.
        //Servisler çalışmadan yetkilendirme yapılabilir.
        log.info("Mesaj veriliyor before = "  + joinPoint.getArgs()[0]);
        log.info("Mesaj veriliyor before = "  + joinPoint.getSignature());
    }
    @After("execution(* cakar.springframework.springbootaop.service.*.*(..))")
    public void mesajVerAfter(JoinPoint joinPoint){
        //Genellikle service katmanında kullanılır.
        //Servisler çalıştıktan sonra loglama yapılabilir.
        log.info("Mesaj veriliyor after = "  + joinPoint.getArgs()[0]);
        log.info("Mesaj veriliyor after = "  + joinPoint.getSignature());
    }
}
