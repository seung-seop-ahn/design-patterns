package _02_structural_patterns._07_proxy._02_after;

import java.lang.reflect.Proxy;

public class DynamicProxy {

    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        dynamicProxy.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return  (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (proxy, method, args) -> {
                    System.out.println("1");
                    method.invoke(target, args);
                    System.out.println("2");
                    return null;
                });
    }
}
