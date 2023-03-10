package com.example.quran;

import java.util.ArrayList;
import java.util.List;


public class QDH {
    public QDH()
    {
    }
    public int [] PSP = {
            1,
            150,
            261,
            387,
            520,
            644,
            756,
            905,
            1048,
            1208,
            1336,
            1488,
            1659,
            1817,
            2044,
            2231,
            2502,
            2694,
            2899,
            3244,
            3412,
            3595,
            3761,
            4127,
            4304,
            4554,
            4755,
            5160,
            5306,
            5748,
    };
    public int[] SSP = {
            1,
            8,
            295,
            496,
            673,
            794,
            960,
            1167,
            1243,
            1372,
            1482,
            1606,
            1718,
            1762,
            1815,
            1915,
            2044,
            2156,
            2267,
            2366,
            2502,
            2615,
            2694,
            2813,
            2878,
            2956,
            3184,
            3278,
            3367,
            3437,
            3498,
            3533,
            3564,
            3638,
            3693,
            3739,
            3823,
            4006,
            4095,
            4171,
            4257,
            4312,
            4366,
            4456,
            4516,
            4554,
            4590,
            4629,
            4659,
            4678,
            4724,
            4785,
            4835,
            4898,
            4954,
            5033,
            5130,
            5160,
            5183,
            5208,
            5222,
            5237,
            5249,
            5261,
            5280,
            5293,
            5306,
            5337,
            5390,
            5443,
            5488,
            5517,
            5546,
            5567,
            5624,
            5665,
            5697,
            5748,
            5789,
            5836,
            5879,
            5909,
            5929,
            5966,
            5992,
            6015,
            6033,
            6053,
            6080,
            6111,
            6132,
            6148,
            6170,
            6182,
            6191,
            6200,
            6220,
            6226,
            6235,
            6244,
            6256,
            6268,
            6277,
            6281,
            6291,
            6297,
            6302,
            6310,
            6314,
            6321,
            6325,
            6331,
            6336,
            6342,
    };
    public int[] surahAyatCount = {
            7,
            286,
            200,
            176,
            120,
            165,
            206,
            75,
            129,
            109,
            123,
            111,
            43,
            52,
            99,
            128,
            111,
            110,
            98,
            135,
            112,
            78,
            118,
            64,
            77,
            227,
            93,
            88,
            69,
            60,
            34,
            30,
            73,
            54,
            45,
            83,
            182,
            88,
            75,
            85,
            54,
            53,
            89,
            59,
            37,
            35,
            38,
            29,
            18,
            45,
            60,
            49,
            62,
            55,
            78,
            96,
            29,
            22,
            24,
            13,
            14,
            11,
            11,
            18,
            12,
            12,
            30,
            52,
            52,
            44,
            28,
            28,
            20,
            56,
            40,
            31,
            50,
            40,
            46,
            42,
            29,
            19,
            36,
            25,
            22,
            17,
            19,
            26,
            30,
            20,
            15,
            21,
            11,
            8,
            8,
            19,
            5,
            8,
            8,
            11,
            11,
            8,
            3,
            9,
            5,
            4,
            7,
            3,
            6,
            3,
            5,
            4,
            5,
            6
    };
    public String[] englishParahName = {"Alif Lam Meem",
            "Sayaqool ",
            "Tilkal Rusull",
            "Lan Tana Loo",
            "Wal Mohsanat",
            "La Yuhibbullah",
            "Wa Iza Samiu",
            "Wa Lau Annana",
            "Qalal Malao",
            "Wa A'lamu",
            "Yatazeroon ",
            "Wa Mamin Da'abat",
            "Wa Ma Ubrioo",
            "Rubama",
            "Subhanallazi",
            "Qal Alam",
            "Aqtarabo",
            "Qadd Aflaha",
            "Wa Qalallazina",
            "A'man Khalaq",
            "Utlu Ma Oohi",
            "Wa Manyaqnut",
            "Wa Mali",
            "Faman Azlam",
            "Elahe Yuruddo",
            "Ha'a Meem",
            "Qala Fama Khatbukum",
            "Qadd Sami Allah",
            "Tabarakallazi",
            "Amma Yatasa'aloon",
    };
    public String[] ParahName = {"الم ",
            "سیقول ",
            "تلک الرسل ",
            "لن تنالوالبر",
            "والمحصنت",
            "لایحب اللہ ",
            "واذاسمعوا",
            "ولواننا",
            "قال الملاء",
            "واعلموا",
            "یعتذرون ",
            "ومامن دآبۃ",
            "وماابرئ",
            "ربما",
            "سبحن الذی ",
            "قال الم ",
            "اقترب للناس",
            "قد افلح",
            "وقال الذین ",
            "امن خلق",
            "اتل مااوحی",
            "ومن یقنت ",
            "ومالی ",
            "فمن اظلم ",
            "الیہ یرد",
            "حم ",
            "قال فماخطبکم ",
            "قدسمع اللہ ",
            "تبارک الذی ",
            "عم یتسآءلون ",
    };
    public String[] englishSurahNames = {"Al-Fatihah",
            "Al-Baqara ",
            "Al-i'Imran ",
            "An-Nisaa ",
            "Al-Maidah ",
            "Al-An'am ",
            "Al-A'raf ",
            "Al-Anfal ",
            "At-Tauba ",
            "Yunus ",
            "Hud ",
            "Yusuf ",
            "Ar-Ra'd ",
            "Ibrahim ",
            "Al-Hijr ",
            "An-Nahl ",
            "Al-Israa ",
            "Al-Kahf ",
            "Maryam ",
            "Ta-ha ",
            "Al-Anbiyaa ",
            "Al-Hajj ",
            "Al-Muminun ",
            "An-Nur ",
            "Al-Furqan ",
            "Ash-Shu'araa ",
            "An-Naml ",
            "Al-Qasas ",
            "Al-Ankabut ",
            "Ar-Rum ",
            "Luqman ",
            "As-Sajda ",
            "Al-Ahzab ",
            "Saba ",
            "Fatir ",
            "Ya-Sin ",
            "As-Saffat ",
            "Sad ",
            "Az-Zumar ",
            "Al-Mu'min ",
            "Ha-Mim ",
            "Ash-Shura ",
            "Az-Zukhruf ",
            "Ad-Dukhan ",
            "Al-Jathiya ",
            "Al-Ahqaf ",
            "Muhammad ",
            "Al-Fat-h ",
            "Al-Hujurat ",
            "Qaf ",
            "Az-Zariyat ",
            "At-Tur ",
            "An-Najm ",
            "Al-Qamar ",
            "Ar-Rahman ",
            "Al-Waqi'a ",
            "Al-Hadid ",
            "Al-Mujadila ",
            "Al-Hashr ",
            "Al-Mumtahana ",
            "As-Saff ",
            "Al-Jumu'a ",
            "Al-Munafiqun ",
            "At-Tagabun ",
            "At-Talaq ",
            "At-Tahrim ",
            "Al-Mulk ",
            "Al-Qalam ",
            "Al-Haqqa ",
            "Al-Ma'arij ",
            "Nuh ",
            "Al-Jinn ",
            "Al-Muzzammil ",
            "Al-Muddathth ",
            "Al-Qiyamat ",
            "Ad-Dahr ",
            "Al-Mursalat ",
            "An-Nabaa ",
            "An-Nazi'at ",
            "Abasa ",
            "At-Takwir ",
            "Al-Infitar ",
            "Al-Mutaffife ",
            "Al-Inshiqaq ",
            "Al-Buruj ",
            "At-Tariq ",
            "Al-A'la ",
            "Al-Gashiya ",
            "Al-Fajr ",
            "Al-Balad ",
            "Ash-Shams ",
            "Al-Lail ",
            "Adh-Dhuha ",
            "Al-Sharh ",
            "At-Tin ",
            "Al-Alaq ",
            "Al-Qadr ",
            "Al-Baiyina ",
            "Al-Zalzalah ",
            "Al-Adiyat ",
            "Al-Qari'a ",
            "At-Takathur ",
            "Al-Asr ",
            "Al-Humaza ",
            "Al-Fil ",
            "Quraish ",
            "Al-Ma'un ",
            "Al-Kauthar ",
            "Al-Kafirun ",
            "An-Nasr ",
            "Al-Lahab ",
            "Al-Ikhlas ",
            "Al-Falaq ",
            "Al-Nas ",
    };
    public String[] urduSurahNames = {
            "الفاتحۃ",
            "البقرۃ",
            "آل عمران",
            "النسآء",
            "المآئدۃ",
            "الانعام",
            "الاعراف",
            "الانفال",
            "التوبۃ",
            "یونس",
            "ھود",
            "یوسف",
            "الرعد",
            "ابراھیم",
            "الحجر",
            "النحل",
            "الاسراء",
            "الکہف",
            "مریم",
            "طٰہٰ",
            "الانبیآء",
            "الحج",
            "المؤمنون",
            "النور",
            "الفرقان",
            "الشعراء",
            "النمل",
            "القصص",
            "العنکبوت",
            "الروم",
            "لقمٰن",
            "السجدۃ",
            "الاحزاب",
            "سبا",
            "فاطر",
            "یٰسٓ",
            "الصّٰفّٰت",
            "صٓ",
            "الزمر",
            "الغافر",
            "فصلت",
            "الشُّورٰی",
            "الزُّخرُف",
            "الدُّخَان",
            "الجاثیہ",
            "الاحقاف",
            "محمد",
            "الفتح",
            "الحجرات",
            "قٓ",
            "الذّٰریٰت",
            "الطّور",
            "النجم",
            "القمر",
            "الرحمٰن",
            "الواقعۃ",
            " الحدید",
            "المجادلۃ",
            "الحشر",
            " الممتحنۃ",
            "الصّف",
            "الجُمعۃ",
            "المُنٰفِقُون",
            " التّغابن",
            "الطّلاق",
            "التحریم",
            "الملک",
            "القلم",
            " الحاقہ",
            "المعارج",
            "نُوح",
            "الجن",
            "المزّمّل",
            "المدّثّر",
            "القیٰمۃ",
            "الانسان",
            "المرسلٰت",
            "النَّبَاِ",
            "النّٰزِعٰتِ",
            "عَبَسَ",
            " التَّکوِیر",
            " الاِنفِطَار",
            "المُطَفِّفِین",
            "الاِنشِقَاق",
            "البُرُوج",
            "الطَّارق",
            "الاَعلیٰ",
            "الغَاشِیَۃ",
            "الفجر",
            "البلد",
            " الشَّمس",
            "الَّیل",
            "الضُّحٰی",
            "الم نشرح",
            "التّین",
            "العَلَق",
            " القدر",
            "البیّنۃ",
            "الزّلزال",
            "العٰدیٰت",
            " القارعۃ",
            "التّکاثُر",
            " العصر",
            "الھُمَزَۃ",
            "الفِیل",
            "قُرَیش",
            "المَاعُون",
            "الکوثر",
            "الکٰفرون",
            "النَّصَر",
            "اللَّھب",
            "الاخلاص",
            "الفَلَق",
            " النَّاس"
    };
    public String[] content = {
            "1:الفاتحۃ",
            "2,3,1:البقرۃ",
            "3,4:آل عمران",
            "4,5,6:النسآء",
            "6,7,8:المآئدۃ",
            "7,8:الانعام",
            "8,9:الاعراف",
            "9,10:الانفال",
            "10,11:التوبۃ",
            "11:یونس",
            "11,12:ھود",
            "12,13:یوسف",
            "13:الرعد",
            "13:ابراھیم",
            "14:الحجر",
            "14:النحل",
            "15:الاسراء",
            "15,16:الکہف",
            "16:مریم",
            "16:طٰہٰ",
            "17:الانبیآء",
            "17:الحج",
            "18:المؤمنون",
            "18:النور",
            "18,19:الفرقان",
            "19:الشعراء",
            "19,20:النمل",
            "20:القصص",
            "20,21:العنکبوت",
            "21:الروم",
            "21:لقمٰن",
            "21:السجدۃ",
            "21,22:الاحزاب",
            "22:سبا",
            "22:فاطر",
            "22,23:یٰسٓ",
            "23:الصّٰفّٰت",
            "23:صٓ",
            "23,24:الزمر",
            "24:الغافر",
            "24,25:فصلت",
            "25:الشُّورٰی",
            "25:الزُّخرُف",
            "25:الدُّخَان",
            "25:الجاثیہ",
            "26:الاحقاف",
            "26:محمد",
            "26:الفتح",
            ":26الحجرات",
            "26:قٓ",
            "26,27:الذّٰریٰت",
            "27:الطّور",
            "27:النجم",
            "27:القمر",
            ":27الرحمٰن",
            "27:الواقعۃ",
            " 27:الحدید",
            ":28المجادلۃ",
            "28:الحشر",
            "28:الممتحنۃ",
            "28:الصّف",
            "28:الجُمعۃ",
            ":28المُنٰفِقُون",
            " 28:التّغابن",
            "28:الطّلاق",
            "28:التحریم",
            "29:الملک",
            "29:القلم",
             "29:الحاقہ",
            "29:المعارج",
            "29:نُوح",
            "29:الجن",
            "29:المزّمّل",
            "29:المدّثّر",
            "29:القیٰمۃ",
            "29:الانسان",
            "29:المرسلٰت",
            "30:النَّبَاِ",
            "30:النّٰزِعٰتِ",
            "30:عَبَسَ",
             "30:التَّکوِیر",
             "30:الاِنفِطَار",
            "30:المُطَفِّفِین",
            "30:الاِنشِقَاق",
            "30:البُرُوج",
            "30:الطَّارق",
            "30:الاَعلیٰ",
            "30:الغَاشِیَۃ",
            "30:الفجر",
            "30:البلد",
             "30:الشَّمس",
            "30:الَّیل",
            "30:الضُّحٰی",
            "30:الم نشرح",
            "30:التّین",
            "30:العَلَق",
             "30:القدر",
            "30:البیّنۃ",
            "30:الزّلزال",
            "30:العٰدیٰت",
             "30:القارعۃ",
            "30:التّکاثُر",
             "30:العصر",
            "30:الھُمَزَۃ",
            "30:الفِیل",
            "30:قُرَیش",
            "30:المَاعُون",
            "30:الکوثر",
            "30:الکٰفرون",
            "30:النَّصَر",
            "30:اللَّھب",
            "30:الاخلاص",
            "30:الفَلَق",
             "30:النَّاس"
    };
    public ArrayList<String> GetSpecificSurahNames(int ParaNumber)
    {
        ArrayList<String> list = new ArrayList<String>();
        for(int index = 0; index < content.length; ++index)
        {
            String [] spliting=content[index].split(":");
            String [] splitingnumbers=spliting[0].split(",");
            for(int i = 0; i < splitingnumbers.length; ++i) {
                if (splitingnumbers[i].equals(String.valueOf(ParaNumber))) {
                    list.add(spliting[1]);
                }
            }
        }
        return list;
    }
    public int getSurahVerses(int surahNumber) {
        return surahAyatCount[surahNumber];
    }
    public int getSurahNumber(String surahName)
    {
        for (int i=0; i<urduSurahNames.length;i++)
        {
            if(urduSurahNames[i].equals(surahName))
            {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<String> GetSurahNames() {
        ArrayList<String> list = new ArrayList<String>();
        for (int index = 0; index < urduSurahNames.length; ++index)
            list.add(urduSurahNames[index]);
        return list;
    }
    public ArrayList<String> GetParaNames() {
        ArrayList<String> list = new ArrayList<String>();
        for (int index = 0; index < ParahName.length; ++index)
            list.add(ParahName[index]);
        return list;
    }

    public int getSurahStart(int surahNumber) {
        return SSP[surahNumber];
    }

    public int getParahStart(int parahNumber) {
        return PSP[parahNumber];
    }
}

