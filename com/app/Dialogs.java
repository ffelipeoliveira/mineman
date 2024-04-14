package com.objects;

public class Dialogs {
    Methods methods = new Methods();
    public void startDialog() {
        String dialog[] = {
            "Existe um tesouro no meio dessa terra, e também bombas! Procure o tesouro enquanto desvia delas.",
            "No meio da terra tem um tesouro e também várias bombas! Procure o tesouro enquanto desvia delas.",
            "Existe, nesse terreno, um tesouro e várias bombas! Procure o tesouro enquanto desvia delas."
        };
        System.out.println(dialog[methods.getRandomNumber(0,2)]);
    }

    public void digDialog() {
        String dialog[] = {
            "Você não achou nada.",
            "Não tinha nada aqui.",
            "Nem um sinal do tesouro aqui.",
            "Nem um sinal do tesouro, que cansativo!",
            "Não tem nada aqui.",
            "Só areia e pedras.",
            "Pedras e mais pedras.",
            "Somente areia e pedras.",
            "Nada, pelo menos não tem uma bomba.",
            "Não achou nada aqui",
            "Não tem nada.",
        };
        System.out.println(dialog[methods.getRandomNumber(0,10)]);
    }

    public void nearBombDialog() {
        String dialog[] = {
            "Tem uma bomba por perto.",
            "Que calafrio, tem bombas por aqui.",
            "Há bombas por aqui.",
            "Tem pelo menos uma bomba por aqui.",
            "Você sente a presença de bombas.",
            "Há uma bomba por perto.",
            "Cheiro forte de pólvora, tem uma bomba por perto.",
            "Tem bombas por aqui.",
            "Tem uma bomba enterrada aqui perto.",
            "Uma bomba foi detectada por perto.",
            "Tem um explosivo por aqui."
        };
        System.out.println(dialog[methods.getRandomNumber(0,10)]);
    }

    public void nearTeasureDialog() {
        String dialog[] = {
            "O tesouro está próximo!",
            "O tesouro está por perto!"
        };
        System.out.println(dialog[methods.getRandomNumber(0,1)]);
    }

    public void treasureDialog() {
        String dialog[] = {
            "Você achou o tesouro!",
            "Parabéns, o tesouro foi encontrado!",
            "O tesouro foi encontrado, parabéns!"
        };
        System.out.println(dialog[methods.getRandomNumber(0,2)]);
    }
}
