import com.android.build.api.dsl.ApplicationProductFlavor
import com.android.build.api.dsl.DynamicFeatureProductFlavor
import com.android.build.api.dsl.LibraryProductFlavor
import com.android.build.gradle.internal.dsl.ProductFlavor
import org.gradle.api.NamedDomainObjectContainer

interface BuildProductFlavor {
    val name: String

    fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<LibraryProductFlavor>
    ): LibraryProductFlavor

    fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<DynamicFeatureProductFlavor>
    ): DynamicFeatureProductFlavor

    fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor


    fun appCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ApplicationProductFlavor>
    ): ApplicationProductFlavor
}

object ProductFlavorDevelop : BuildProductFlavor {
    override val name = "dev"
    override fun libraryCreate(namedDomainObjectContainer: NamedDomainObjectContainer<LibraryProductFlavor>): LibraryProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }

    override fun libraryCreate(namedDomainObjectContainer: NamedDomainObjectContainer<DynamicFeatureProductFlavor>): DynamicFeatureProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }

    override fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            versionNameSuffix = "-dev"
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }

    override fun appCreate(namedDomainObjectContainer:
                           NamedDomainObjectContainer<ApplicationProductFlavor>)
    : ApplicationProductFlavor {
        return namedDomainObjectContainer.create(name) {
            applicationIdSuffix = ".dev"
            versionNameSuffix = "-dev"
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }
}

object ProductFlavorQA : BuildProductFlavor {
    override val name = "uat"
    override fun libraryCreate(namedDomainObjectContainer: NamedDomainObjectContainer<LibraryProductFlavor>): LibraryProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }

    override fun libraryCreate(namedDomainObjectContainer: NamedDomainObjectContainer<DynamicFeatureProductFlavor>): DynamicFeatureProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }


    override fun appCreate(namedDomainObjectContainer: NamedDomainObjectContainer<ApplicationProductFlavor>): ApplicationProductFlavor {
        return namedDomainObjectContainer.create(name) {
            applicationIdSuffix = ".uat"
            versionNameSuffix = "-uat"
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }

    override fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            versionNameSuffix = "-uat"
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }
}

object ProductFlavorProduction : BuildProductFlavor {
    override val name = "prod"
    override fun libraryCreate(namedDomainObjectContainer: NamedDomainObjectContainer<LibraryProductFlavor>): LibraryProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }

    override fun libraryCreate(namedDomainObjectContainer: NamedDomainObjectContainer<DynamicFeatureProductFlavor>): DynamicFeatureProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }

    override fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }

    override fun appCreate(namedDomainObjectContainer: NamedDomainObjectContainer<ApplicationProductFlavor>): ApplicationProductFlavor {
        return namedDomainObjectContainer.create(name) {
            applicationIdSuffix = ".prod"
            versionNameSuffix = "-prod"
            dimension = BuildProductDimensions.ENVIRONMENT
        }
    }
}