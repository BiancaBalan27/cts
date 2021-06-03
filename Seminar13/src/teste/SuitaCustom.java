package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;

@RunWith(Categories.class)
@SuiteClasses({ TestGrupa.class, TestGrupaFixture.class, TestGrupaWithDummy.class, TestGrupaWithFake.class,
		TestGrupaWithStub.class })
@IncludeCategory(TesteGetPromovabilitate.class)
@ExcludeCategory(TesteNormale.class)
public class SuitaCustom {

}
